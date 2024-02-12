

class TreeNode{
    
    int val;        //initialinsing a varible to store the data
    TreeNode left;      //initialising 2 refeence objects
    TreeNode right;
    
    
    TreeNode(int val){          //initialising constructor 
        
        this.val = val;         //assigns value to current variable
        left = null;            //asigns references a ocal values
        right=null;
        
    }
    
}

 public class Main
{
    
    
    
    
    public static void inorder(TreeNode root){
        // left->root->right
        
        if(root==null) return;
        
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
        
        
    }
    
    
    public static void preorder(TreeNode root){
        // root->left->right
        
        if(root==null) return;
       
       
       System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
        
        
    }
    
    public static void postorder(TreeNode root){
        // left->root->right
        
        if(root==null) return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);

        
    }
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		TreeNode root = new TreeNode(1);
		
		
		root.left = new TreeNode(3);
		root.right = new TreeNode(4);
		
		
		preorder(root);
		
	}
}
