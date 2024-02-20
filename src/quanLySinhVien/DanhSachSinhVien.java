/**
 * 
 */
package quanLySinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class DanhSachSinhVien {
	private List<SinhVien> danhSachSinhVien;

	/**  
	 * 
	 */
	public DanhSachSinhVien() {
		// TODO Auto-generated constructor stub
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}

	public void themSinhVien(SinhVien sv) {
		this.danhSachSinhVien.add(sv);

	}

	public SinhVien svDiemTbCaoNhat() {
		SinhVien kq = this.danhSachSinhVien.get(0);
		header();
		for (SinhVien sv : this.danhSachSinhVien) {
			if (sv.getDiemTB() > kq.getDiemTB()) {
				kq = sv;
			}
		}
		return kq;
	}

	public void tatCaSinhVienYeu() {
		int stt = 0;
		header();
		for (SinhVien sv : this.danhSachSinhVien) {
			if (sv.getDiemTB() < 5) {
				stt++;
				sv.xuatSinhVien(stt);
			}
		}
		if (stt == 0) {
			System.out.println("\t\t\t Không Có Sinh Viên Loại Yếu");
		}
	}

	public List<SinhVien> timSinhVienTheoTen(String ten) {
		List<SinhVien> kq = new ArrayList<SinhVien>();
		header();
		for (SinhVien sv : this.danhSachSinhVien) {
			if (sv.getTenSV().toLowerCase().equals(ten.toLowerCase())) {
				kq.add(sv);
			}
		}
		return kq;
	}
	
	public SinhVien timSinhVienTheoMa(int maSV) {
		SinhVien kq = null;
		header();
		for(SinhVien sv: this.danhSachSinhVien) {
		 if(sv.getMaSV() == maSV) {
			 kq = sv ;
		 }
		}
		
		return kq;
				
	}
	
	public void xoaSinhVienTheoMa(int maSV) {
		char chon;
		Scanner scan = new Scanner(System.in);
		for (SinhVien sv: this.danhSachSinhVien) {
			if(sv.getMaSV() == maSV ) {
				System.out.println("Bạn chắc chắn xoá ? Chọn 'Y' hoặc 'N' ");
				chon = scan.nextLine().charAt(0);
				switch (chon ) {
				case 'Y':
					this.danhSachSinhVien.remove(sv);
					break;
				case 'N':
					break;
				default:
					break;
				}
			}
		}
	}
	

	public void xuatTatCaSinhVien() {
		int stt = 0;
		header();
		for (SinhVien sv : this.danhSachSinhVien) {
			stt++;
			sv.xuatSinhVien(stt);
		}
	}

	public void header() {
		System.out.println(
				"\n -----------------------------------------------------------Thông Tin Sinh Viên----------------------------------------------------------");
		System.out.print("STT \t|");
		System.out.print("Mã sinh Viên \t|");
		System.out.print("Tên Sinh Viên \t\t|");
		System.out.print("Điểm toán \t|");
		System.out.print("Điểm Lý \t|");
		System.out.print("Điểm Hoá \t|");
		System.out.print("Điểm TB \t|");
		System.out.print("Xếp loại \t \n");
		gach();

	}

	public void gach() {
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
