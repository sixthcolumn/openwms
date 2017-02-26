require 'test_helper'

class MaterialItemsControllerTest < ActionController::TestCase
  setup do
    @material_item = material_items(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:material_items)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create material_item" do
    assert_difference('MaterialItem.count') do
      post :create, material_item: { multiplier: @material_item.multiplier, quantity: @material_item.quantity, unit: @material_item.unit }
    end

    assert_redirected_to material_item_path(assigns(:material_item))
  end

  test "should show material_item" do
    get :show, id: @material_item
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @material_item
    assert_response :success
  end

  test "should update material_item" do
    patch :update, id: @material_item, material_item: { multiplier: @material_item.multiplier, quantity: @material_item.quantity, unit: @material_item.unit }
    assert_redirected_to material_item_path(assigns(:material_item))
  end

  test "should destroy material_item" do
    assert_difference('MaterialItem.count', -1) do
      delete :destroy, id: @material_item
    end

    assert_redirected_to material_items_path
  end
end
