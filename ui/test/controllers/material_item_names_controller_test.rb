require 'test_helper'

class MaterialItemNamesControllerTest < ActionController::TestCase
  setup do
    @material_item_name = material_item_names(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:material_item_names)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create material_item_name" do
    assert_difference('MaterialItemName.count') do
      post :create, material_item_name: { material_item_id: @material_item_name.material_item_id, name: @material_item_name.name, name_type_id: @material_item_name.name_type_id }
    end

    assert_redirected_to material_item_name_path(assigns(:material_item_name))
  end

  test "should show material_item_name" do
    get :show, id: @material_item_name
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @material_item_name
    assert_response :success
  end

  test "should update material_item_name" do
    patch :update, id: @material_item_name, material_item_name: { material_item_id: @material_item_name.material_item_id, name: @material_item_name.name, name_type_id: @material_item_name.name_type_id }
    assert_redirected_to material_item_name_path(assigns(:material_item_name))
  end

  test "should destroy material_item_name" do
    assert_difference('MaterialItemName.count', -1) do
      delete :destroy, id: @material_item_name
    end

    assert_redirected_to material_item_names_path
  end
end
