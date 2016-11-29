require 'test_helper'

class ResultcodesControllerTest < ActionController::TestCase
  setup do
    @resultcode = resultcodes(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:resultcodes)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create resultcode" do
    assert_difference('Resultcode.count') do
      post :create, resultcode: { name: @resultcode.name }
    end

    assert_redirected_to resultcode_path(assigns(:resultcode))
  end

  test "should show resultcode" do
    get :show, id: @resultcode
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @resultcode
    assert_response :success
  end

  test "should update resultcode" do
    patch :update, id: @resultcode, resultcode: { name: @resultcode.name }
    assert_redirected_to resultcode_path(assigns(:resultcode))
  end

  test "should destroy resultcode" do
    assert_difference('Resultcode.count', -1) do
      delete :destroy, id: @resultcode
    end

    assert_redirected_to resultcodes_path
  end
end
