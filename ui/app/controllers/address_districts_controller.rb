class AddressDistrictsController < ApplicationController
  before_action :set_address_district, only: [:show, :edit, :update, :destroy]

  # GET /address_districts
  # GET /address_districts.json
  def index
    @address_districts = AddressDistrict.all
  end

  # GET /address_districts/1
  # GET /address_districts/1.json
  def show
  end

  # GET /address_districts/new
  def new
    @address_district = AddressDistrict.new
  end

  # GET /address_districts/1/edit
  def edit
  end

  # POST /address_districts
  # POST /address_districts.json
  def create
    @address_district = AddressDistrict.new(address_district_params)

    respond_to do |format|
      if @address_district.save
        format.html { redirect_to @address_district, notice: 'Address district was successfully created.' }
        format.json { render :show, status: :created, location: @address_district }
      else
        format.html { render :new }
        format.json { render json: @address_district.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /address_districts/1
  # PATCH/PUT /address_districts/1.json
  def update
    respond_to do |format|
      if @address_district.update(address_district_params)
        format.html { redirect_to @address_district, notice: 'Address district was successfully updated.' }
        format.json { render :show, status: :ok, location: @address_district }
      else
        format.html { render :edit }
        format.json { render json: @address_district.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /address_districts/1
  # DELETE /address_districts/1.json
  def destroy
    @address_district.destroy
    respond_to do |format|
      format.html { redirect_to address_districts_url, notice: 'Address district was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_address_district
      @address_district = AddressDistrict.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def address_district_params
      params.require(:address_district).permit(:address_id, :district_id)
    end
end
