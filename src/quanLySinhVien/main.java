package quanLySinhVien;

import java.util.List;
import java.util.Scanner;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		chonMenu(dssv);

	}

	public static void chonMenu(DanhSachSinhVien dssv) {
		Scanner scan = new Scanner(System.in);
		int n, stt;
		boolean thoat = false;
		do {
			thongBao();
			n = Integer.parseInt(scan.nextLine());
			switch (n) {
			case 1:
				// Nhập sinh viên
				SinhVien sv = new SinhVien();
				sv.nhapSinhVien();
				// Tính điểm trung bình
				sv.tinhDiemTB();
				// Xếp loại sinh viên
				sv.xepLoai();
				// Thêm sv vào danh sách
				dssv.themSinhVien(sv);
				break;
			case 2:
				// Xuất sinh viên
				dssv.xuatTatCaSinhVien();
				break;
			case 3:
				dssv.svDiemTbCaoNhat().xuatSinhVien(1);
				break;
			case 4:
				dssv.tatCaSinhVienYeu();
				break;
			case 5:
				stt = 0;
				System.out.println("Vui lòng nhập tên sinh viên cần tìm : ");
				String ten = scan.nextLine();

				List<SinhVien> dsSvTimDuoc = dssv.timSinhVienTheoTen(ten);
				for (SinhVien svTimDuoc : dsSvTimDuoc) {
					stt++;
					svTimDuoc.xuatSinhVien(stt);
				}
				if (stt == 0) {
					System.out.println("\t\t\t Không tìm thấy sinh Viên");
				}
				break;

			case 6:
				System.out.println("Vui Lòng nhập mã Sinh Viên cần tìm ");
				int maSV = Integer.parseInt(scan.nextLine());
				if(dssv.timSinhVienTheoMa( maSV) != null) {
					dssv.timSinhVienTheoMa(maSV).xuatSinhVien(1);
				}else {
					System.out.println("t\t\t Không tìm thấy sinh viên");
				}
				break;
			case 7: 
				// xoá sinh viên 
				System.out.println("Vui Lòng nhập mã Sinh Viên cần xoá");
				maSV = Integer.parseInt(scan.nextLine());
				dssv.xoaSinhVienTheoMa(maSV);
				break;
				
			case 0:
				// Thoát chương trình
				thoat = true;
				System.out.println("Thoát chương trình");
				break;

			default:
				break;
			}
		} while (!thoat);

	}

	public static void thongBao() {
		System.out.print("\nVui lòng chọn tính năng: \n" + "\t1.Thêm sinh viên \n" + "\t2.Xuất sinh viên \n"
				+ "\t3.Tìm Sinh viên có DTB cao nhất \n" + "\t4.In ra tất cả sinh viên yếu \n"
				+ "\t5.Tìm sinh viên theo tên\n" + "\t6.Tìm sinh viên theo mã\n" + "\t7.Xoá một sinh viên\n"
				+ "\t0.Thoát chương trình \n");
	}

}
