package product_management;


import add_product.AddProductScreen;
import back_to_home.BackToHomeScreen;
import delete_product.DeleteProductScreen;
import edit_product.EditProductScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;


public class ProductManagementScreenController {
	
	@FXML
	private Button addProduct;
	
	@FXML
	private Button editProduct;
	
	@FXML
	private Button searchProduct;
	
	@FXML
	private Button deleteProduct;
	
	@FXML
	private Button backToHome;
	
	public void showAddProductScreen(ActionEvent event) {
		
	     AddProductScreen.showAddProductScreen();
		
	}
	public void showEditProductScreen(ActionEvent event) {
		
		EditProductScreen.showEditProductScreen();
		
	}
	public void showSearchProductScreen(ActionEvent event) {
		
		SearchProductScreen.showSearchProductScreen();
		
	}
	public void showDeleteProductScreen(ActionEvent event) {
		
		DeleteProductScreen.showDeleteProductScreen();
	}
	public void showBackToHomeScreen(ActionEvent event) {
		
		try {
			BackToHomeScreen.showBackScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
