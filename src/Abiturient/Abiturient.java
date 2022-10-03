package Abiturient;
/**
 * Клас Abiturient
 * <p>
 * Функціонал класу:
 * <p>
 * виведення списку абітурієнтів із вказаним іменем;
 * <p>
 * виведення списку абітурієнтів, середній бал у яких вище заданого;
 * <p>
 * вибір заданого числа n абітурієнтів, що мають найвищий середній бал.
 * <p>
 * @author Yuliia Fito
 */
public class Abiturient{
    /**  id абітурієнта   */
    private int id;
    /** прізвище    */
    private String surname;
    /** ім'я    */
    private String name;
    /** по батькові    */
    private String patronymic;
    /** адреса     */
    private String address;
    /** телефон    */
    private String phone;
    /**  середній бал   */
    private double mark;

    public Abiturient(){}

    /**
     * Конструктор класу
     * @param id  id абітурієнта
     * @param surname прізвище
     * @param name ім'я
     * @param patronymic по батькові
     * @param address  адреса
     * @param phone телефон
     * @param mark середній бал
     */
    public Abiturient(int id, String surname, String name, String patronymic,
                      String address, String phone, double mark){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.mark = mark;
    }


    /**
     * Перевизначений метод toString()
     * @return повертає символьний рядок, що описує об’єкт
     */
    @Override
    public String toString(){
        return "id:" + id + ", " + surname + " " + name + " " + patronymic + ", "
                + address + ", " + phone + ", ср.бал = " + mark + ";";
    }

    /**
     * Геттер для поля id
     * @return id абітурієнта
     */
    public int getId(){
        return id;
    }

    /**
     * Сеттер для поля id
     * @param id id абітурієнта
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Геттер для поля surname
     * @return прізвище абітурієнта
     */
    public String getSurname(){
        return surname;
    }

    /**
     * Сеттер для поля surname
     * @param surname прізвище абітурієнта
     */
    public void setSurname(String surname){
        this.surname = surname;
    }

    /**
     * Геттер для поля name
     * @return ім'я абітурієнта
     */
    public String getName(){
        return name;
    }

    /**
     * Сеттер для поля name
     * @param name ім'я абітурієнта
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Геттер для поля patronymic
     * @return по батькові абітурієнта
     */
    public String getPatronymic(){
        return patronymic;
    }

    /**
     * Сеттер для поля patronymic
     * @param patronymic по батькові абітурієнта
     */
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    /**
     * Геттер для поля address
     * @return адресу абітурієнта
     */
    public String getAddress(){
        return address;
    }

    /**
     * Сеттер для поля address
     * @param address адреса абітурієнта
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Геттер для поля phone
     * @return номер телефону абітурієнта
     */
    public String getPhone(){
        return phone;
    }

    /**
     * Сеттер для поля phone
     * @param phone номер телефону абітурієнта
     */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
     * Геттер для поля mark
     * @return середній бал абітурієнта
     */
    public double getMark(){
        return mark;
    }

    /**
     * Сеттер для поля mark
     * @param mark середній бал абітурієнта
     */
    public void setMark(double mark){
        this.mark = mark;
    }
}
