class VendorRoleTypesController < ApplicationController
  before_action :set_vendor_role_type, only: [:show, :edit, :update, :destroy]

  # GET /vendor_role_types
  # GET /vendor_role_types.json
  def index
    @vendor_role_types = VendorRoleType.all
  end

  # GET /vendor_role_types/1
  # GET /vendor_role_types/1.json
  def show
  end

  # GET /vendor_role_types/new
  def new
    @vendor_role_type = VendorRoleType.new
  end

  # GET /vendor_role_types/1/edit
  def edit
  end

  # POST /vendor_role_types
  # POST /vendor_role_types.json
  def create
    @vendor_role_type = VendorRoleType.new(vendor_role_type_params)

    respond_to do |format|
      if @vendor_role_type.save
        format.html { redirect_to @vendor_role_type, notice: 'Vendor role type was successfully created.' }
        format.json { render :show, status: :created, location: @vendor_role_type }
      else
        format.html { render :new }
        format.json { render json: @vendor_role_type.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /vendor_role_types/1
  # PATCH/PUT /vendor_role_types/1.json
  def update
    respond_to do |format|
      if @vendor_role_type.update(vendor_role_type_params)
        format.html { redirect_to @vendor_role_type, notice: 'Vendor role type was successfully updated.' }
        format.json { render :show, status: :ok, location: @vendor_role_type }
      else
        format.html { render :edit }
        format.json { render json: @vendor_role_type.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /vendor_role_types/1
  # DELETE /vendor_role_types/1.json
  def destroy
    @vendor_role_type.destroy
    respond_to do |format|
      format.html { redirect_to vendor_role_types_url, notice: 'Vendor role type was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_vendor_role_type
      @vendor_role_type = VendorRoleType.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def vendor_role_type_params
      params.require(:vendor_role_type).permit(:name, :active_flag)
    end
end
