package onetotest.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ansId")
    private int ansId;

    private String ansName;

    @OneToOne(mappedBy = "ans") // Inverse side of the relationship
    private Question ques;

    // Getters and Setters
    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public String getAnsName() {
        return ansName;
    }

    public void setAnsName(String ansName) {
        this.ansName = ansName;
    }

    public Question getQuest() {
        return ques;
    }

    public void setQues(Question ques) {
        this.ques = ques;
    }

    @Override
    public String toString() {
        return "Answer [ansId=" + ansId + ", ansName=" + ansName + "]";
    }
}
