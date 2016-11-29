require 'test_helper'

class MaintordersControllerTest < ActionController::TestCase
  setup do
    @maintorder = maintorders(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:maintorders)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create maintorder" do
    assert_difference('Maintorder.count') do
      post :create, maintorder: { created_by: @maintorder.created_by, mRID: @maintorder.mRID, maintorder_id: @maintorder.maintorder_id, name_type_id: @maintorder.name_type_id, status: @maintorder.status }
    end

    assert_redirected_to maintorder_path(assigns(:maintorder))
  end

  test "should show maintorder" do
    get :show, id: @maintorder
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @maintorder
    assert_response :success
  end

  test "should update maintorder" do
    patch :update, id: @maintorder, maintorder: { created_by: @maintorder.created_by, mRID: @maintorder.mRID, maintorder_id: @maintorder.maintorder_id, name_type_id: @maintorder.name_type_id, status: @maintorder.status }
    assert_redirected_to maintorder_path(assigns(:maintorder))
  end

  test "should destroy maintorder" do
    assert_difference('Maintorder.count', -1) do
      delete :destroy, id: @maintorder
    end

    assert_redirected_to maintorders_path
  end
end
