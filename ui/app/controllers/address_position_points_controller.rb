class AddressPositionPointsController < ApplicationController
  before_action :set_address_position_point, only: [:show, :edit, :update, :destroy]

  # GET /address_position_points
  # GET /address_position_points.json
  def index
    @address_position_points = AddressPositionPoint.all
  end

  # GET /address_position_points/1
  # GET /address_position_points/1.json
  def show
  end

  # GET /address_position_points/new
  def new
    @address_position_point = AddressPositionPoint.new
  end

  # GET /address_position_points/1/edit
  def edit
  end

  # POST /address_position_points
  # POST /address_position_points.json
  def create
    @address_position_point = AddressPositionPoint.new(address_position_point_params)

    respond_to do |format|
      if @address_position_point.save
        format.html { redirect_to @address_position_point, notice: 'Address position point was successfully created.' }
        format.json { render :show, status: :created, location: @address_position_point }
      else
        format.html { render :new }
        format.json { render json: @address_position_point.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /address_position_points/1
  # PATCH/PUT /address_position_points/1.json
  def update
    respond_to do |format|
      if @address_position_point.update(address_position_point_params)
        format.html { redirect_to @address_position_point, notice: 'Address position point was successfully updated.' }
        format.json { render :show, status: :ok, location: @address_position_point }
      else
        format.html { render :edit }
        format.json { render json: @address_position_point.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /address_position_points/1
  # DELETE /address_position_points/1.json
  def destroy
    @address_position_point.destroy
    respond_to do |format|
      format.html { redirect_to address_position_points_url, notice: 'Address position point was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_address_position_point
      @address_position_point = AddressPositionPoint.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def address_position_point_params
      params.require(:address_position_point).permit(:address_id, :sequence, :xposition, :yposition, :zposition)
    end
end
