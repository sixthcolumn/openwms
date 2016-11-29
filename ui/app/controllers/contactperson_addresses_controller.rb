class ContactpersonAddressesController < ApplicationController
  before_action :set_contactperson_address, only: [:show, :edit, :update, :destroy]

  # GET /contactperson_addresses
  # GET /contactperson_addresses.json
  def index
    @contactperson_addresses = ContactpersonAddress.all
  end

  # GET /contactperson_addresses/1
  # GET /contactperson_addresses/1.json
  def show
  end

  # GET /contactperson_addresses/new
  def new
    @contactperson_address = ContactpersonAddress.new
  end

  # GET /contactperson_addresses/1/edit
  def edit
  end

  # POST /contactperson_addresses
  # POST /contactperson_addresses.json
  def create
    @contactperson_address = ContactpersonAddress.new(contactperson_address_params)

    respond_to do |format|
      if @contactperson_address.save
        format.html { redirect_to @contactperson_address, notice: 'Contactperson address was successfully created.' }
        format.json { render :show, status: :created, location: @contactperson_address }
      else
        format.html { render :new }
        format.json { render json: @contactperson_address.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /contactperson_addresses/1
  # PATCH/PUT /contactperson_addresses/1.json
  def update
    respond_to do |format|
      if @contactperson_address.update(contactperson_address_params)
        format.html { redirect_to @contactperson_address, notice: 'Contactperson address was successfully updated.' }
        format.json { render :show, status: :ok, location: @contactperson_address }
      else
        format.html { render :edit }
        format.json { render json: @contactperson_address.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /contactperson_addresses/1
  # DELETE /contactperson_addresses/1.json
  def destroy
    @contactperson_address.destroy
    respond_to do |format|
      format.html { redirect_to contactperson_addresses_url, notice: 'Contactperson address was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_contactperson_address
      @contactperson_address = ContactpersonAddress.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def contactperson_address_params
      params.require(:contactperson_address).permit(:contactperson_id, :address_id, :address_type, :priority_order)
    end
end
