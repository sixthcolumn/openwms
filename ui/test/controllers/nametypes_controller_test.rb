require 'test_helper'

class NametypesControllerTest < ActionController::TestCase
  setup do
    @nametype = nametypes(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:nametypes)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create nametype" do
    assert_difference('Nametype.count') do
      post :create, nametype: { name: @nametype.name, name_type_authority_id: @nametype.name_type_authority_id }
    end

    assert_redirected_to nametype_path(assigns(:nametype))
  end

  test "should show nametype" do
    get :show, id: @nametype
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @nametype
    assert_response :success
  end

  test "should update nametype" do
    patch :update, id: @nametype, nametype: { name: @nametype.name, name_type_authority_id: @nametype.name_type_authority_id }
    assert_redirected_to nametype_path(assigns(:nametype))
  end

  test "should destroy nametype" do
    assert_difference('Nametype.count', -1) do
      delete :destroy, id: @nametype
    end

    assert_redirected_to nametypes_path
  end
end
