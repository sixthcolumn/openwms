require 'test_helper'

class ProcedsControllerTest < ActionController::TestCase
  setup do
    @proced = proceds(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:proceds)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create proced" do
    assert_difference('Proced.count') do
      post :create, proced: { instruction: @proced.instruction, kind: @proced.kind, sequence: @proced.sequence }
    end

    assert_redirected_to proced_path(assigns(:proced))
  end

  test "should show proced" do
    get :show, id: @proced
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @proced
    assert_response :success
  end

  test "should update proced" do
    patch :update, id: @proced, proced: { instruction: @proced.instruction, kind: @proced.kind, sequence: @proced.sequence }
    assert_redirected_to proced_path(assigns(:proced))
  end

  test "should destroy proced" do
    assert_difference('Proced.count', -1) do
      delete :destroy, id: @proced
    end

    assert_redirected_to proceds_path
  end
end
