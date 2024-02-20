/**
 * 
 */
package quanLySinhVien;

import java.util.Scanner;

/**
 * 
 */
public class SinhVien {

	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	private float diemTB = 0;
	private String xepLoai = "chưa xếp loại"; 

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	/**
	 * 
	 */
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String tenSV, int maSV, float diemToan, float diemHoa, float diemLy) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemLy = diemLy;

	}
	public void tinhDiemTB() {
		this.diemTB = (this.diemHoa + this.diemLy + this.diemToan)/3;
	}
	
	public void xepLoai() {
		if(this.diemTB <= 10 && this.diemTB >= 9) {
			this.xepLoai =" Xuất sắc";
		} else if(this.diemTB < 9 && this.diemTB >= 8){
			this.xepLoai = "Giỏi";
		}else if(this.diemTB < 8 && this.diemTB >= 7){
			this.xepLoai = "Khá";
		}else if(this.diemTB < 7 && this.diemTB >= 6){
			this.xepLoai = "TB khá";
		}else if(this.diemTB < 6 && this.diemTB >= 5){
			this.xepLoai = "Trung bình";
		}else {
			this.xepLoai = "Yếu";
		}
	}

	public void nhapSinhVien() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Nhập vào mã Sinh Viên : ");
		this.maSV = Integer.parseInt(scanner.nextLine());

		System.out.print(" Nhập vào tên Sinh Viên : ");
		this.tenSV = scanner.nextLine();

//		System.out.print(" Nhập vào điểm toán : ");
//		this.diemToan = Integer.parseInt(scanner.nextLine());
		
		this.diemToan = kiemTraDiem(scanner,"toán");
		
//		System.out.print(" Nhập vào điểm hoá : ");
//		this.diemHoa = Integer.parseInt(scanner.nextLine());
		
		this.diemHoa = kiemTraDiem(scanner,"Hoá");
		
//		System.out.print(" Nhập vào điểm Lý : ");
//		this.diemLy = Integer.parseInt(scanner.nextLine());
		
		this.diemLy  = kiemTraDiem(scanner,"Lý");

	}
	
	public float kiemTraDiem( Scanner scan, String monHoc ) {
		float diem;
		do {
		 System.out.print("Nhập điểm " + monHoc + " từ 0 - 10 : ");
		 diem = Integer.parseInt(scan.nextLine());
		}while(diem > 10 || diem < 0);
		return diem;
	}

	public void xuatSinhVien(int stt) {
		System.out.print(stt + "\t|");
		System.out.print(this.maSV + "\t\t|");
		System.out.print(this.tenSV + "\t\t\t|");
		System.out.print(this.diemToan + "\t\t|");
		System.out.print(this.diemLy + "\t\t|");
		System.out.print(this.diemHoa + "\t\t|");
		System.out.print(this.diemTB + "\t\t|");
		System.out.print(this.xepLoai + "\t\t \n");
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

}
