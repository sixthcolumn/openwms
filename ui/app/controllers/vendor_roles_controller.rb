class VendorRolesController < ApplicationController
  before_action :set_vendor_role, only: [:show, :edit, :update, :destroy]

  # GET /vendor_roles
  # GET /vendor_roles.json
  def index
    @vendor_roles = VendorRole.all
  end

  # GET /vendor_roles/1
  # GET /vendor_roles/1.json
  def show
  end

  # GET /vendor_roles/new
  def new
    @vendor_role = VendorRole.new
  end

  # GET /vendor_roles/1/edit
  def edit
  end

  # POST /vendor_roles
  # POST /vendor_roles.json
  def create
    @vendor_role = VendorRole.new(vendor_role_params)

    respond_to do |format|
      if @vendor_role.save
        format.html { redirect_to @vendor_role, notice: 'Vendor role was successfully created.' }
        format.json { render :show, status: :created, location: @vendor_role }
      else
        format.html { render :new }
        format.json { render json: @vendor_role.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /vendor_roles/1
  # PATCH/PUT /vendor_roles/1.json
  def update
    respond_to do |format|
      if @vendor_role.update(vendor_role_params)
        format.html { redirect_to @vendor_role, notice: 'Vendor role was successfully updated.' }
        format.json { render :show, status: :ok, location: @vendor_role }
      else
        format.html { render :edit }
        format.json { render json: @vendor_role.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /vendor_roles/1
  # DELETE /vendor_roles/1.json
  def destroy
    @vendor_role.destroy
    respond_to do |format|
      format.html { redirect_to vendor_roles_url, notice: 'Vendor role was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_vendor_role
      @vendor_role = VendorRole.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def vendor_role_params
      params.require(:vendor_role).permit(:name, :vendor_role_type_id)
    end
end
