package factory.AbstractFactory;

/**
 * 皮肤工厂
 */
public interface SkinFactory {

    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}
