class AddressHazardsController < ApplicationController
  before_action :set_address_hazard, only: [:show, :edit, :update, :destroy]

  # GET /address_hazards
  # GET /address_hazards.json
  def index
    @address_hazards = AddressHazard.all
  end

  # GET /address_hazards/1
  # GET /address_hazards/1.json
  def show
  end

  # GET /address_hazards/new
  def new
    @address_hazard = AddressHazard.new
  end

  # GET /address_hazards/1/edit
  def edit
  end

  # POST /address_hazards
  # POST /address_hazards.json
  def create
    @address_hazard = AddressHazard.new(address_hazard_params)

    respond_to do |format|
      if @address_hazard.save
        format.html { redirect_to @address_hazard, notice: 'Address hazard was successfully created.' }
        format.json { render :show, status: :created, location: @address_hazard }
      else
        format.html { render :new }
        format.json { render json: @address_hazard.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /address_hazards/1
  # PATCH/PUT /address_hazards/1.json
  def update
    respond_to do |format|
      if @address_hazard.update(address_hazard_params)
        format.html { redirect_to @address_hazard, notice: 'Address hazard was successfully updated.' }
        format.json { render :show, status: :ok, location: @address_hazard }
      else
        format.html { render :edit }
        format.json { render json: @address_hazard.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /address_hazards/1
  # DELETE /address_hazards/1.json
  def destroy
    @address_hazard.destroy
    respond_to do |format|
      format.html { redirect_to address_hazards_url, notice: 'Address hazard was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_address_hazard
      @address_hazard = AddressHazard.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def address_hazard_params
      params.require(:address_hazard).permit(:address_id, :hazard_id)
    end
end
