class MaterialItemNamesController < ApplicationController
  before_action :set_material_item_name, only: [:show, :edit, :update, :destroy]

  # GET /material_item_names
  # GET /material_item_names.json
  def index
    @material_item_names = MaterialItemName.all
  end

  # GET /material_item_names/1
  # GET /material_item_names/1.json
  def show
  end

  # GET /material_item_names/new
  def new
    @material_item_name = MaterialItemName.new
  end

  # GET /material_item_names/1/edit
  def edit
  end

  # POST /material_item_names
  # POST /material_item_names.json
  def create
    @material_item_name = MaterialItemName.new(material_item_name_params)

    respond_to do |format|
      if @material_item_name.save
        format.html { redirect_to @material_item_name, notice: 'Material item name was successfully created.' }
        format.json { render :show, status: :created, location: @material_item_name }
      else
        format.html { render :new }
        format.json { render json: @material_item_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /material_item_names/1
  # PATCH/PUT /material_item_names/1.json
  def update
    respond_to do |format|
      if @material_item_name.update(material_item_name_params)
        format.html { redirect_to @material_item_name, notice: 'Material item name was successfully updated.' }
        format.json { render :show, status: :ok, location: @material_item_name }
      else
        format.html { render :edit }
        format.json { render json: @material_item_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /material_item_names/1
  # DELETE /material_item_names/1.json
  def destroy
    @material_item_name.destroy
    respond_to do |format|
      format.html { redirect_to material_item_names_url, notice: 'Material item name was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_material_item_name
      @material_item_name = MaterialItemName.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def material_item_name_params
      params.require(:material_item_name).permit(:material_item_id, :name, :name_type_id)
    end
end
