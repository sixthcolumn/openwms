require 'test_helper'

class AssetProcedsControllerTest < ActionController::TestCase
  setup do
    @asset_proced = asset_proceds(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:asset_proceds)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create asset_proced" do
    assert_difference('AssetProced.count') do
      post :create, asset_proced: { asset_id: @asset_proced.asset_id, proced_id: @asset_proced.proced_id }
    end

    assert_redirected_to asset_proced_path(assigns(:asset_proced))
  end

  test "should show asset_proced" do
    get :show, id: @asset_proced
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @asset_proced
    assert_response :success
  end

  test "should update asset_proced" do
    patch :update, id: @asset_proced, asset_proced: { asset_id: @asset_proced.asset_id, proced_id: @asset_proced.proced_id }
    assert_redirected_to asset_proced_path(assigns(:asset_proced))
  end

  test "should destroy asset_proced" do
    assert_difference('AssetProced.count', -1) do
      delete :destroy, id: @asset_proced
    end

    assert_redirected_to asset_proceds_path
  end
end
