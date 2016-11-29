require 'test_helper'

class ContactpersonOtherContactinfosControllerTest < ActionController::TestCase
  setup do
    @contactperson_other_contactinfo = contactperson_other_contactinfos(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:contactperson_other_contactinfos)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create contactperson_other_contactinfo" do
    assert_difference('ContactpersonOtherContactinfo.count') do
      post :create, contactperson_other_contactinfo: { contactperson_id: @contactperson_other_contactinfo.contactperson_id, other_contactinfo_id: @contactperson_other_contactinfo.other_contactinfo_id }
    end

    assert_redirected_to contactperson_other_contactinfo_path(assigns(:contactperson_other_contactinfo))
  end

  test "should show contactperson_other_contactinfo" do
    get :show, id: @contactperson_other_contactinfo
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @contactperson_other_contactinfo
    assert_response :success
  end

  test "should update contactperson_other_contactinfo" do
    patch :update, id: @contactperson_other_contactinfo, contactperson_other_contactinfo: { contactperson_id: @contactperson_other_contactinfo.contactperson_id, other_contactinfo_id: @contactperson_other_contactinfo.other_contactinfo_id }
    assert_redirected_to contactperson_other_contactinfo_path(assigns(:contactperson_other_contactinfo))
  end

  test "should destroy contactperson_other_contactinfo" do
    assert_difference('ContactpersonOtherContactinfo.count', -1) do
      delete :destroy, id: @contactperson_other_contactinfo
    end

    assert_redirected_to contactperson_other_contactinfos_path
  end
end
