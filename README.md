# APP MỘT SỐ ĐỊA ĐIỂM DU LỊCH TẠI TP.HCM

Một ứng dụng di động được xây dựng bằng Kotlinand Jetpack Compose, cung cấp thông tin du lịch đến nhiều địa điểm văn hóa và giải trí khác nhau tại Thành phố Hồ Chí Minh, Việt Nam.

- .gitignore: Git giữ repo sạch, bỏ file tạm thời
- apptravel.zip: bản nén mã nguồn (code)
- build.gradle.kts: cấu hình build chính của dự án
- gradle.properties: toàn cấu hình biến
- gradlew(.bat): Công cụ xây dựng dự án mà không cần cài đặt Gradle
- settings.gradle.kts: khai báo các module trong dự án
- result.docx: kết quả của app

## Chức năng

- Bản đồ tương tác với các điểm đánh dấu có thể nhấp cho từng điểm đến.
- Hình ảnh ngoại tuyến và mô tả về các địa điểm nổi tiếng.
- Xem thông tin chi tiết cho từng địa điểm trong giao diện.
- Điều hướng qua các màn hình khác nhau (HomeScreen, MainScreen, AboutScreen).

## Cấu trúc dự án

```
apptravel/
├── ui/
│ ├── MainActivity.kt # Điểm vào của ứng dụng
│ ├── screen/
│ │ ├── HomeScreen.kt # Màn hình đầu tiên, giới thiệu các chức năng chính của ứng dụng
│ │ ├── MainScreen.kt # nút lọc vị trí bản đồ + chủ đề, hộp thoại thông tin: hiển thị tên + mô tả + ảnh, nút định vị GPS: điều hướng đến vị trí của người dùng.
│ │ └── AboutScreen.kt # Giới thiệu thành viên
│ └── theme/
│ ├── Color.kt
│ ├── Theme.kt
│ └── Type.kt # Kiểu chữ tùy chỉnh

## Công nghệ sử dụng

- Kotlin + Jetpack Compose
- osmdroid để hiển thị bản đồ và điểm đánh dấu
- GeoJSON cho dữ liệu không gian
- Assets cho hình ảnh và nội dung ngoại tuyến

# Cách chạy

1. Sao chép hoặc tải xuống kho lưu trữ này.
2. Mở dự án trong Android Studio (Arctic Fox trở lên).
3. Kết nối trình giả lập Android hoặc thiết bị vật lý.
4. Chạy ứng dụng.

## Assets

- Tất cả hình ảnh được lưu trữ trong thư mục 'assets/images/' và được tải động.
- Thông tin địa điểm có thể nằm trong tệp '.geojson', được phân tích cú pháp khi chạy.


![Image](https://github.com/user-attachments/assets/abf5aaa5-410c-493a-be84-7575f4e18211)


