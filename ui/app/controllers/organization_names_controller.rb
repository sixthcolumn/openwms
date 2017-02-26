class OrganizationNamesController < ApplicationController
  before_action :set_organization_name, only: [:show, :edit, :update, :destroy]

  # GET /organization_names
  # GET /organization_names.json
  def index
    @organization_names = OrganizationName.all
  end

  # GET /organization_names/1
  # GET /organization_names/1.json
  def show
  end

  # GET /organization_names/new
  def new
    @organization_name = OrganizationName.new
  end

  # GET /organization_names/1/edit
  def edit
  end

  # POST /organization_names
  # POST /organization_names.json
  def create
    @organization_name = OrganizationName.new(organization_name_params)

    respond_to do |format|
      if @organization_name.save
        format.html { redirect_to @organization_name, notice: 'Organization name was successfully created.' }
        format.json { render :show, status: :created, location: @organization_name }
      else
        format.html { render :new }
        format.json { render json: @organization_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /organization_names/1
  # PATCH/PUT /organization_names/1.json
  def update
    respond_to do |format|
      if @organization_name.update(organization_name_params)
        format.html { redirect_to @organization_name, notice: 'Organization name was successfully updated.' }
        format.json { render :show, status: :ok, location: @organization_name }
      else
        format.html { render :edit }
        format.json { render json: @organization_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /organization_names/1
  # DELETE /organization_names/1.json
  def destroy
    @organization_name.destroy
    respond_to do |format|
      format.html { redirect_to organization_names_url, notice: 'Organization name was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_organization_name
      @organization_name = OrganizationName.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def organization_name_params
      params.require(:organization_name).permit(:organization_id, :name, :name_type_id)
    end
end
