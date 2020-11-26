package by.epam.maven.task2;

public class Date {
	
	int year;
	int mounth;

	public Date(int mounth, int year) {
		this.year = year;
		this.mounth = mounth;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMounth(int mounth) {
		this.mounth = mounth;
	}
	
	public int getMounth() {
		return mounth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mounth;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (mounth != other.mounth)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return year + "." + mounth;
	}
}