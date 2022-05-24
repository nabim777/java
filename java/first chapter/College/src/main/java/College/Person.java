/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

/**
 *
 * @author eerie
 */


class Person
{
	protected String name,address,email;
	protected long phone_number;
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getEmail()
	{
		return email;
	}
	
	public long getPhone()
	{
		return phone_number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setName(long phone)
	{
		phone_number=phone;
	}
	public Person(String nam, String addr, String mail, long phone)
	{
		name=nam;
		address=addr;
		email=mail;
		phone_number =phone;
	}
	
	@Override
	public String toString()
	{
		return "Name:" + name + " Address:" + address+ " email:" + email + " phone number:" +phone_number;
	}
	
	
	
}
