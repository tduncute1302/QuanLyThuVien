# Danh sách sách ban đầu
danh_sach_sach = []

# Hàm thêm sách mới vào danh sách
def them_sach():
    ma_sach = input("Nhập mã sách: ")
    ten_sach = input("Nhập tên sách: ")
    tac_gia = input("Nhập tên tác giả: ")
    sach_moi = {
        "ma_sach": ma_sach,
        "ten_sach": ten_sach,
        "tac_gia": tac_gia
    }
    danh_sach_sach.append(sach_moi)
    print("Đã thêm sách thành công!\n")

# Hàm hiển thị tất cả sách
def hien_thi_sach():
    if not danh_sach_sach:
        print("Chưa có sách trong danh sách.\n")
    else:
        print("Danh sách sách hiện có:")
        for sach in danh_sach_sach:
            print(f"Mã sách: {sach['ma_sach']}, Tên sách: {sach['ten_sach']}, Tác giả: {sach['tac_gia']}")
        print()

# Ví dụ sử dụng
while True:
    print("1. Thêm sách")
    print("2. Hiển thị sách")
    print("3. Thoát")
    lua_chon = input("Chọn chức năng: ")

    if lua_chon == "1":
        them_sach()
    elif lua_chon == "2":
        hien_thi_sach()
    elif lua_chon == "3":
        print("Kết thúc chương trình.")
        break
    else:
        print("Lựa chọn không hợp lệ. Vui lòng chọn lại.\n")
