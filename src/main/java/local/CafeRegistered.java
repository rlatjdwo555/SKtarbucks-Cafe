package local;

public class CafeRegistered extends AbstractEvent {

    private Long id;
    private String cafeNm;
    private String chkDate;
    private Long pCnt;

    public CafeRegistered(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCafeNm() {
        return cafeNm;
    }

    public void setCafeNm(String cafeNm) {
        this.cafeNm = cafeNm;
    }
    public String getChkDate() {
        return chkDate;
    }

    public void setChkDate(String chkDate) {
        this.chkDate = chkDate;
    }

    public Long getpCnt() {
        return pCnt;
    }

    public void setpCnt(Long pCnt) {
        this.pCnt = pCnt;
    }
}
