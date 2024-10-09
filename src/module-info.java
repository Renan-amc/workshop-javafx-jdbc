module javafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	exports gui;
	
	opens gui to javafx.fxml;

    opens model.entities to javafx.base;
	opens application to javafx.graphics, javafx.fxml;
}
