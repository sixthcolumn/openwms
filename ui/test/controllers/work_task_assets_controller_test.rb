require 'test_helper'

class WorkTaskAssetsControllerTest < ActionController::TestCase
  setup do
    @work_task_asset = work_task_assets(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:work_task_assets)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create work_task_asset" do
    assert_difference('WorkTaskAsset.count') do
      post :create, work_task_asset: { asset_id: @work_task_asset.asset_id, created_by: @work_task_asset.created_by, work_task_id: @work_task_asset.work_task_id }
    end

    assert_redirected_to work_task_asset_path(assigns(:work_task_asset))
  end

  test "should show work_task_asset" do
    get :show, id: @work_task_asset
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @work_task_asset
    assert_response :success
  end

  test "should update work_task_asset" do
    patch :update, id: @work_task_asset, work_task_asset: { asset_id: @work_task_asset.asset_id, created_by: @work_task_asset.created_by, work_task_id: @work_task_asset.work_task_id }
    assert_redirected_to work_task_asset_path(assigns(:work_task_asset))
  end

  test "should destroy work_task_asset" do
    assert_difference('WorkTaskAsset.count', -1) do
      delete :destroy, id: @work_task_asset
    end

    assert_redirected_to work_task_assets_path
  end
end
