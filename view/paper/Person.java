package Paper;

public class Person {
    private String fullName, from, to, reason, ma_hk;

    public Person(String fullName, String from, String to, String reason, String ma_hk) {
        this.fullName = fullName;
        this.from = from;
        this.to = to;
        this.reason = reason;
        this.ma_hk = ma_hk;
    }

	public String getFullName() {
		return fullName;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getReason() {
		return reason;
	}

	public String getMa_hk() {
		return ma_hk;
	}

    
}