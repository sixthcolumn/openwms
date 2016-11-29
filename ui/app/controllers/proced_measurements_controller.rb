class ProcedMeasurementsController < ApplicationController
  before_action :set_proced_measurement, only: [:show, :edit, :update, :destroy]

  # GET /proced_measurements
  # GET /proced_measurements.json
  def index
    @proced_measurements = ProcedMeasurement.all
  end

  # GET /proced_measurements/1
  # GET /proced_measurements/1.json
  def show
  end

  # GET /proced_measurements/new
  def new
    @proced_measurement = ProcedMeasurement.new
  end

  # GET /proced_measurements/1/edit
  def edit
  end

  # POST /proced_measurements
  # POST /proced_measurements.json
  def create
    @proced_measurement = ProcedMeasurement.new(proced_measurement_params)

    respond_to do |format|
      if @proced_measurement.save
        format.html { redirect_to @proced_measurement, notice: 'Proced measurement was successfully created.' }
        format.json { render :show, status: :created, location: @proced_measurement }
      else
        format.html { render :new }
        format.json { render json: @proced_measurement.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /proced_measurements/1
  # PATCH/PUT /proced_measurements/1.json
  def update
    respond_to do |format|
      if @proced_measurement.update(proced_measurement_params)
        format.html { redirect_to @proced_measurement, notice: 'Proced measurement was successfully updated.' }
        format.json { render :show, status: :ok, location: @proced_measurement }
      else
        format.html { render :edit }
        format.json { render json: @proced_measurement.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /proced_measurements/1
  # DELETE /proced_measurements/1.json
  def destroy
    @proced_measurement.destroy
    respond_to do |format|
      format.html { redirect_to proced_measurements_url, notice: 'Proced measurement was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_proced_measurement
      @proced_measurement = ProcedMeasurement.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def proced_measurement_params
      params.require(:proced_measurement).permit(:proced_id, :measurement_id)
    end
end
