class NametypesController < ApplicationController
  before_action :set_nametype, only: [:show, :edit, :update, :destroy]

  # GET /nametypes
  # GET /nametypes.json
  def index
    @nametypes = Nametype.all
  end

  # GET /nametypes/1
  # GET /nametypes/1.json
  def show
  end

  # GET /nametypes/new
  def new
    @nametype = Nametype.new
  end

  # GET /nametypes/1/edit
  def edit
  end

  # POST /nametypes
  # POST /nametypes.json
  def create
    @nametype = Nametype.new(nametype_params)

    respond_to do |format|
      if @nametype.save
        format.html { redirect_to @nametype, notice: 'Nametype was successfully created.' }
        format.json { render :show, status: :created, location: @nametype }
      else
        format.html { render :new }
        format.json { render json: @nametype.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /nametypes/1
  # PATCH/PUT /nametypes/1.json
  def update
    respond_to do |format|
      if @nametype.update(nametype_params)
        format.html { redirect_to @nametype, notice: 'Nametype was successfully updated.' }
        format.json { render :show, status: :ok, location: @nametype }
      else
        format.html { render :edit }
        format.json { render json: @nametype.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /nametypes/1
  # DELETE /nametypes/1.json
  def destroy
    @nametype.destroy
    respond_to do |format|
      format.html { redirect_to nametypes_url, notice: 'Nametype was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_nametype
      @nametype = Nametype.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def nametype_params
      params.require(:nametype).permit(:name, :name_type_authority_id)
    end
end
