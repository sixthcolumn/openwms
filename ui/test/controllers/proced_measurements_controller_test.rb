require 'test_helper'

class ProcedMeasurementsControllerTest < ActionController::TestCase
  setup do
    @proced_measurement = proced_measurements(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:proced_measurements)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create proced_measurement" do
    assert_difference('ProcedMeasurement.count') do
      post :create, proced_measurement: { measurement_id: @proced_measurement.measurement_id, proced_id: @proced_measurement.proced_id }
    end

    assert_redirected_to proced_measurement_path(assigns(:proced_measurement))
  end

  test "should show proced_measurement" do
    get :show, id: @proced_measurement
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @proced_measurement
    assert_response :success
  end

  test "should update proced_measurement" do
    patch :update, id: @proced_measurement, proced_measurement: { measurement_id: @proced_measurement.measurement_id, proced_id: @proced_measurement.proced_id }
    assert_redirected_to proced_measurement_path(assigns(:proced_measurement))
  end

  test "should destroy proced_measurement" do
    assert_difference('ProcedMeasurement.count', -1) do
      delete :destroy, id: @proced_measurement
    end

    assert_redirected_to proced_measurements_path
  end
end
