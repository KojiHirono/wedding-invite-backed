package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "guestinfo")
public class GuestInfo {

	/** id */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/** 出席フラグ */
	private int attendance;
	/** ゲストカテゴリー */
	private int guestCategory;
	/** 姓 */
	private String lastName;
	/** 名 */
	private String firstName;
	/** せい */
	private String lastNameKana;
	/** めい */
	private String firstNameKana;
	/** sei */
	private String lastNameRomaji;
	/** mei */
	private String firstNameRomaji;
	/** メールアドレス */
	private String email;
	/** 年齢 */
	private int age;
	/** 郵便番号 */
	private String postalCode;
	/** 住所 */
	private String address;
	/** 建物名 */
	private String building;
	/** 電話番号 */
	private String phone;
	/** アレルギー */
	private String allergy;
	/** メッセージ */
	private String message;
	/** 犬アレルギー */
	private int dogAllergy;
//	/** 作成日時 */
//	private LocalDate created_at;
//	/** 更新日時 */
//	private LocalDate updated_at;
	
    public GuestInfo() {
        // デフォルトコンストラクタ（必須）
    }
	
    public GuestInfo(GuestInfo dto) {
        this.attendance = dto.getAttendance();
        this.guestCategory = dto.getGuestCategory();
        this.lastName = dto.getLastName();
        this.firstName = dto.getFirstName();
        this.lastNameKana = dto.getLastNameKana();
        this.firstNameKana = dto.getFirstNameKana();
        this.lastNameRomaji = dto.getLastNameRomaji();
        this.firstNameRomaji = dto.getFirstNameRomaji();
        this.email = dto.getEmail();
        this.age = dto.getAge();
        this.postalCode = dto.getPostalCode();
        this.address = dto.getAddress();
        this.building = dto.getBuilding();
        this.phone = dto.getPhone();
        this.allergy = dto.getAllergy();
        this.message = dto.getMessage();
        this.dogAllergy = dto.getDogAllergy();
    }

}
