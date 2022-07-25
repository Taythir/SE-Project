public class User
{
    String name;
    String card;
    String address;
    String phone_number;
    int age;
    int books_checked_out;
    double money_owed; // user's total fine that hasn't been paid

    public User(String n, String c, String ad, String p, int ag)
    {
        name = n;
        card = c;
        address = a;
        phone_number = p;
        age = ag;
        books_checked_out = 0;
    }

    public getName()
    {
        return name;
    }

    public setName(String s)
    {
        name = s;
    }

    public getCard()
    {
        return card;
    }

    public setCard(String c)
    {
        card = c;
    }

    public getAddress()
    {
        return address;
    }

    public setAddress(String ad)
    {
        address = ad
    }

    public getPhoneNumber()
    {
        return phone_number;
    }

    public setPhoneNumber(String p)
    {
        phone_number = p;
    }

    public getAge()
    {
        return age;
    }

    public setAge(String ag)
    {
        age = ag;
    }

}
