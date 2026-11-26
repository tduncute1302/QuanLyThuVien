# Danh sách các sách, mỗi sách là một từ điển chứa mã sách, tên sách và tác giả
danh_sach_sach = [
    {"ma_sach": "S001", "ten_sach": "Lập Trình Python Cơ Bản", "tac_gia": "Nguyễn Văn A"},
    {"ma_sach": "S002", "ten_sach": "Học Máy và Trí Tuệ Nhân Tạo", "tac_gia": "Trần Thị B"},
    {"ma_sach": "S003", "ten_sach": "Cấu Trúc Dữ Liệu", "tac_gia": "Lê Văn C"},
]

# In ra danh sách sách
for sach in danh_sach_sach:
    print(f"Mã sách: {sach['ma_sach']}, Tên sách: {sach['ten_sach']}, Tác giả: {sach['tac_gia']}")
