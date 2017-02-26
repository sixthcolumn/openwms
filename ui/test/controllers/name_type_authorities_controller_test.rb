require 'test_helper'

class NameTypeAuthoritiesControllerTest < ActionController::TestCase
  setup do
    @name_type_authority = name_type_authorities(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:name_type_authorities)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create name_type_authority" do
    assert_difference('NameTypeAuthority.count') do
      post :create, name_type_authority: { description: @name_type_authority.description, name: @name_type_authority.name }
    end

    assert_redirected_to name_type_authority_path(assigns(:name_type_authority))
  end

  test "should show name_type_authority" do
    get :show, id: @name_type_authority
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @name_type_authority
    assert_response :success
  end

  test "should update name_type_authority" do
    patch :update, id: @name_type_authority, name_type_authority: { description: @name_type_authority.description, name: @name_type_authority.name }
    assert_redirected_to name_type_authority_path(assigns(:name_type_authority))
  end

  test "should destroy name_type_authority" do
    assert_difference('NameTypeAuthority.count', -1) do
      delete :destroy, id: @name_type_authority
    end

    assert_redirected_to name_type_authorities_path
  end
end
