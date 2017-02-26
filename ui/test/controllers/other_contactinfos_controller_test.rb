require 'test_helper'

class OtherContactinfosControllerTest < ActionController::TestCase
  setup do
    @other_contactinfo = other_contactinfos(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:other_contactinfos)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create other_contactinfo" do
    assert_difference('OtherContactinfo.count') do
      post :create, other_contactinfo: { details: @other_contactinfo.details, info_type: @other_contactinfo.info_type }
    end

    assert_redirected_to other_contactinfo_path(assigns(:other_contactinfo))
  end

  test "should show other_contactinfo" do
    get :show, id: @other_contactinfo
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @other_contactinfo
    assert_response :success
  end

  test "should update other_contactinfo" do
    patch :update, id: @other_contactinfo, other_contactinfo: { details: @other_contactinfo.details, info_type: @other_contactinfo.info_type }
    assert_redirected_to other_contactinfo_path(assigns(:other_contactinfo))
  end

  test "should destroy other_contactinfo" do
    assert_difference('OtherContactinfo.count', -1) do
      delete :destroy, id: @other_contactinfo
    end

    assert_redirected_to other_contactinfos_path
  end
end
