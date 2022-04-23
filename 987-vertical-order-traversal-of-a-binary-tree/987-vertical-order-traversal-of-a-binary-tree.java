class Pair{
        TreeNode node;
        int x;  //horizontal
        int y;  //depth
        Pair(TreeNode n, int x, int y)
        {
            node = n;
            this.x = x;
            this.y = y;
        }
    }
class Solution{ 
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer, List<Pair>> map = new HashMap<>(); //x -> list (some nodes might have same y in the list)
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));
        int min = 0, max = 0;
        while(!q.isEmpty())
        {
            Pair p = q.remove(); 
            
            min = Math.min(min, p.x);
            max = Math.max(max, p.x);
            
            if(!map.containsKey(p.x)) 
                map.put(p.x, new ArrayList<>());
            map.get(p.x).add(p);
            
            if(p.node.left!=null) q.add(new Pair(p.node.left, p.x-1, p.y+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right, p.x+1, p.y+1));
        }        

        for(int i=min; i<=max; i++)
        {
            Collections.sort(map.get(i), new Comparator<Pair>(){
                public int compare(Pair a, Pair b)
                {
                    if(a.y==b.y) //when y is equal, sort it by value
                        return a.node.val - b.node.val;
                    return 0; //otherwise don't change the order as BFS ganrantees that top nodes are visited first
                }
            });
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<map.get(i).size(); j++)
            {
                list.add(map.get(i).get(j).node.val);
            }
            lists.add(list);
        }
        return lists;   
    }}