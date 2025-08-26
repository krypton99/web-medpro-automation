Feature: Homepage
  Label is used to determine all homepage features

  Background:
    Given Set browser to "fullscreen"
    And Set environment "prod"
    And User open Medpro

  @verify_header_item
  Scenario: Assert homepage header attribute
#    And User should see homepage banner
#    And User should close homepage banner
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
#    And User should close homepage banner
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
#    And User should close homepage banner
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
#    And User should close homepage banner
    And User should click on header element "<header_element>"
    Then User should redirect to "<url>" with type "<type>"
    Examples:
      | header_element             | url                                          | type  |
      | Logo Medpro                | https://medpro.vn/                           | self  |
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
#    And User should close homepage banner
    And User should click on health facility logo "<hospital_name>" in slide "<slide_index>"
    Then User should redirect to "<url>" with type "<type>"
    Then User should see health facility name "<hospital_name>" on health facility detail page version "<version>"
    Examples:
      | hospital_name                           | url                           | type | version | slide_index |
      | Trung Tâm Nội Soi Tiêu Hoá Doctor Check | https://medpro.vn/drcheck     | self | 2       | 1           |
      | Bệnh viện Lao và Bệnh phổi Cần Thơ      | https://medpro.vn/bvlaophoict | self | 1       | 4           |

  @verify_click_on_carousel_banner_element
  Scenario Outline: Assert click on carousel banner
#    And User should close homepage banner
    And User should click on carousel banner number "<banner_index>"
    Then User should redirect to "<url>" with type "<type>"
    Examples:
      | banner_index | url                                                                                                               | type |
      | 3            | https://medpro.vn/phong-kham-giam-can-medfit?utm_source=web&utm_medium=banner_homepage&utm_campaign=medpro_medfit | self |

  @verify_click_on_most_like_hospital_card
  Scenario Outline: Assert click on most like hospital card
#    And User should close homepage banner
    And User should move to most like hospital section
    And User should click on most like hospital card "<hospital_name>"
    Then User should redirect to "<url>" with type "<type>"
    Then User should see health facility name "<hospital_name>" on health facility detail page version "<version>"
    Examples:
      | hospital_name | url                        | type | version |
      | Bệnh Viện Mắt | https://medpro.vn/bvmathcm | self | 2       |

  @verify_click_on_most_like_hospital_booking_button
  Scenario Outline: Assert click on most like hospital booking button
#    And User should close homepage banner
    And User should move to most like hospital section
    And User should click on most like hospital "<hospital_name>" booking button
    Then User should redirect to "<url>" with type "<type>"
    Then User should see health facility name "<hospital_name>" on choose booking service page
    Examples:
      | hospital_name | url                                                                              | type |
      | Bệnh Viện Mắt | https://medpro.vn/bvmathcm/hinh-thuc-dat-kham?bookingPage=%2F&partnerId=bvmathcm | self |

  @verify_click_on_carousel_multi_banner_element
  Scenario Outline: Assert click on carousel multi banner
#    And User should close homepage banner
    And User should move to carousel multi banner section
    And User should click on carousel multi banner with slide number "<slide_index>" and banner number "<banner_index>"
    Then User should redirect to "<url>" with type "<type>"
    Examples:
      | banner_index | url                                                                                 | type  | slide_index |
      | 2            | https://medpro.vn/care247?utm_source=web&utm_medium=bannermini&utm_campaign=care247 | blank | 2           |

  @verify_click_on_telemed_doctor_card
  Scenario Outline: Assert click on telemed doctor card
#    And User should close homepage banner
    And User should move to telemed section
    And User should click on telemed doctor card "<doctor_name>"
    Then User should redirect to "<url>" with type "<type>"
    Then User should see doctor name "<doctor_name>" on doctor detail page
    Examples:
      | doctor_name | url                                       | type |
      | Vũ Thị Hà   | https://medpro.vn/bac-si/bs-cki-vu-thi-ha | self |

  @verify_click_on_telemed_booking_button
  Scenario Outline: Assert click on telemed booking button
#    And User should close homepage banner
    And User should move to telemed section
    And User should click on telemed doctor "<doctor_name>" booking button
    Then User should redirect to "<url>" with type "<type>"
    Examples:
      | doctor_name | url                                                                                                                                                         | type |
      | Vũ Thị Hà   | https://medpro.vn/chon-lich-kham?feature=booking.TELEMEDNOW&partnerId=digimed&doctorId=digimed_HAVUT&bookingPage=%2F&stepName=service&subjectId=digimed_MAT | self |

  @verify_click_on_health_package_card
  Scenario Outline: Assert click on health package card
#    And User should close homepage banner
    And User should move to health package section
    And User should choose health package type "<package_type>"
    And User should click on health package card "<package_name>"
    Then User should redirect to "<url>" with type "<type>"
    Then User should see health package name "<package_name>" on health package detail page
    Examples:
      | package_type | package_name | url                                       | type |
      | Sức khỏe   |Đặt khám Bệnh Dạ dày - Đại tràng  |https://medpro.vn/goi-kham-suc-khoe/drcheck_013 | self |