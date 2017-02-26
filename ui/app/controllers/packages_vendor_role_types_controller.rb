class PackagesVendorRoleTypesController < ApplicationController
  before_action :set_packages_vendor_role_type, only: [:show, :edit, :update, :destroy]

  # GET /packages_vendor_role_types
  # GET /packages_vendor_role_types.json
  def index
    @packages_vendor_role_types = PackagesVendorRoleType.all
  end

  # GET /packages_vendor_role_types/1
  # GET /packages_vendor_role_types/1.json
  def show
  end

  # GET /packages_vendor_role_types/new
  def new
    @packages_vendor_role_type = PackagesVendorRoleType.new
  end

  # GET /packages_vendor_role_types/1/edit
  def edit
  end

  # POST /packages_vendor_role_types
  # POST /packages_vendor_role_types.json
  def create
    @packages_vendor_role_type = PackagesVendorRoleType.new(packages_vendor_role_type_params)

    respond_to do |format|
      if @packages_vendor_role_type.save
        format.html { redirect_to @packages_vendor_role_type, notice: 'Packages vendor role type was successfully created.' }
        format.json { render :show, status: :created, location: @packages_vendor_role_type }
      else
        format.html { render :new }
        format.json { render json: @packages_vendor_role_type.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /packages_vendor_role_types/1
  # PATCH/PUT /packages_vendor_role_types/1.json
  def update
    respond_to do |format|
      if @packages_vendor_role_type.update(packages_vendor_role_type_params)
        format.html { redirect_to @packages_vendor_role_type, notice: 'Packages vendor role type was successfully updated.' }
        format.json { render :show, status: :ok, location: @packages_vendor_role_type }
      else
        format.html { render :edit }
        format.json { render json: @packages_vendor_role_type.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /packages_vendor_role_types/1
  # DELETE /packages_vendor_role_types/1.json
  def destroy
    @packages_vendor_role_type.destroy
    respond_to do |format|
      format.html { redirect_to packages_vendor_role_types_url, notice: 'Packages vendor role type was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_packages_vendor_role_type
      @packages_vendor_role_type = PackagesVendorRoleType.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def packages_vendor_role_type_params
      params.require(:packages_vendor_role_type).permit(:package_id, :vendor_role_type_id)
    end
end
