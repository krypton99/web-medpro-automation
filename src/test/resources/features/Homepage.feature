Feature: Homepage
  Label is used to determine all homepage features

  Background:
    Given Set browser to "fullscreen"
    And Set environment "prod"
    And User open Medpro

  @verify_header_item
  Scenario: Assert homepage header attribute
    And User should see homepage banner
    And User should close homepage banner
    And User should see medpro logo
    And User should see tiktok logo
    And User should see facebook logo
    And User should see zalo logo
    And User should see youtube logo
    And User should see download app button
    And User should see account menu
    And User should see choose language button
    And User should see health facility menu
    And User should see health service menu
    And User should see corporate health check menu
    And User should see health news menu
    And User should see helps menu
    And User should see contact for cooperation menu

  @verify_homepage_element
  Scenario: Assert homepage element
    And User should close homepage banner
    And User should see homepage scroll band
    And User should see universal search input
    And User should see cooperated section
    And User should see carousel banner section
    And User should see most like health facility section
    And User should see multi carousel banner section
    And User should see telemed section
    And User should see health package section
    And User should see speciality section
    And User should see download app section
    And User should see review section
    And User should see social media section
    And User should see statistic section
    And User should see medical news section
    And User should see support section

  @verify_feature_element
  Scenario Outline: Assert homepage feature element
    And User should close homepage banner
    And User should click on feature "<feature>"
    Then User should redirect to "<url>" with type "<type>"

    Examples:
      | feature                | url                                                                                                                           | type  |
      | Đặt khám tại cơ sở     | https://medpro.vn/dich-vu-y-te/dat-kham-tai-co-so                                                                             | self  |
      | Đặt khám chuyên khoa   | https://medpro.vn/dich-vu-y-te/dat-kham-chuyen-khoa                                                                           | self  |
      | Gọi video với bác sĩ   | https://medpro.vn/dich-vu-y-te/tu-van-kham-benh-tu-xa                                                                         | self  |
      | Mua thuốc tại An Khang | https://www.nhathuocankhang.com/?utm_source=web&utm_medium=card&utm_campaign=medpro_ankhang&utm_content=feature_card_homepage | blank |
      | Giúp việc cá nhân      | https://medpro.vn/care247                                                                                                     | blank |
      | Khám doanh nghiệp      | https://medpro.vn/kham-suc-khoe-doanh-nghiep                                                                                  | self  |
      | Đặt lịch xét nghiệm    | https://medpro.vn/dich-vu-y-te/dat-lich-xet-nghiem                                                                            | self  |
      | Gói khám sức khỏe      | https://medpro.vn/dich-vu-y-te/goi-kham-suc-khoe                                                                              | self  |
      | Y tế tại nhà           | https://medpro.vn/dich-vu-y-te/y-te-tai-nha                                                                                   | self  |
      | Đặt lịch tiêm chủng    | https://medpro.vn/dich-vu-y-te/dat-lich-tiem-chung                                                                            | self  |
      | Đặt khám ngoài giờ     | https://medpro.vn/dich-vu-y-te/dat-kham-ngoai-gio                                                                             | self  |
      | Khám sức khỏe thông tư | https://medpro.vn/dich-vu-y-te/dat-kham-thong-tu                                                                              | self  |
      | Thanh toán viện phí    | https://medpro.vn/dich-vu-y-te/thanh-toan-vien-phi                                                                            | self  |


  @verify_click_on_header_element
  Scenario Outline: Assert click on header element
    And User should close homepage banner
    And User should click on header element "<header_element>"
    Then User should redirect to "<url>" with type "<type>"
    Examples:
      | header_element             | url                                          | type  |
      | Logo Medpro                | https://medpro.vn/                            | self  |
      | Tiktok                     | https://www.tiktok.com/@medprovn             | blank |
      | Facebook                   | https://www.facebook.com/www.medpro.vn       | blank |
      | Zalo                       | https://zalo.me/4018184502979486994          | blank |
      | Youtube                    | https://www.youtube.com/@medpro-datkhamnhanh | blank |
      | Tải ứng dụng               | https://medpro.vn/#download                  | self  |
      | Tài khoản                  | https://id.medpro.vn/check-phone             | self  |
      | Cơ sở y tế                 | https://medpro.vn/co-so-y-te                 | self  |
      | Dịch vụ y tế               | https://medpro.vn/dich-vu-y-te               | self  |
      | Khám sức khỏe doanh nghiệp | https://medpro.vn/kham-suc-khoe-doanh-nghiep | self  |
      | Tin tức                    | https://medpro.vn/tin-tuc                    | self  |
      | Hướng dẫn                  | https://medpro.vn/huong-dan/cai-dat-ung-dung | self  |
      | Liên hệ hợp tác            | https://medpro.vn/hop-tac-cung-medpro        | self  |

  @verify_click_on_cooperate_health_facility
  Scenario Outline: Assert click on health facility logo
    And User should close homepage banner
    And User should click on health facility logo "<header_element>"
    Then User should redirect to "<url>" with type "<type>"
    Then User should see health facility name on health facility detail page version "<version>"
    Examples:
      | header_element             | url                                          | type  | version |
      | Logo Medpro                | https://medpro.vn/                            | self  |        1|