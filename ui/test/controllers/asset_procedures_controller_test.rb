require 'test_helper'

class AssetProceduresControllerTest < ActionController::TestCase
  setup do
    @asset_procedure = asset_procedures(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:asset_procedures)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create asset_procedure" do
    assert_difference('AssetProcedure.count') do
      post :create, asset_procedure: { asset_id: @asset_procedure.asset_id, procedure_id: @asset_procedure.procedure_id }
    end

    assert_redirected_to asset_procedure_path(assigns(:asset_procedure))
  end

  test "should show asset_procedure" do
    get :show, id: @asset_procedure
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @asset_procedure
    assert_response :success
  end

  test "should update asset_procedure" do
    patch :update, id: @asset_procedure, asset_procedure: { asset_id: @asset_procedure.asset_id, procedure_id: @asset_procedure.procedure_id }
    assert_redirected_to asset_procedure_path(assigns(:asset_procedure))
  end

  test "should destroy asset_procedure" do
    assert_difference('AssetProcedure.count', -1) do
      delete :destroy, id: @asset_procedure
    end

    assert_redirected_to asset_procedures_path
  end
end
