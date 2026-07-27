/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,List<Integer>> sub=new HashMap<>();
        HashMap<Integer,Integer> imp=new HashMap<>();
        for(int i=0;i<employees.size();i++){
            sub.put(employees.get(i).id,new ArrayList<>(employees.get(i).subordinates));
            imp.put(employees.get(i).id,employees.get(i).importance);
        }
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(id);
        int impp=0;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                int c=q.poll();
                List<Integer> ls=sub.get(c);
                impp+=imp.get(c);
                if(ls.size()==0) continue;
                for(int ids:ls){
                    q.offer(ids);
                }
            }
        }
        return impp;
    }
}