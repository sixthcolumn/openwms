class AssetProcedsController < ApplicationController
  before_action :set_asset_proced, only: [:show, :edit, :update, :destroy]

  # GET /asset_proceds
  # GET /asset_proceds.json
  def index
    @asset_proceds = AssetProced.all
  end

  # GET /asset_proceds/1
  # GET /asset_proceds/1.json
  def show
  end

  # GET /asset_proceds/new
  def new
    @asset_proced = AssetProced.new
  end

  # GET /asset_proceds/1/edit
  def edit
  end

  # POST /asset_proceds
  # POST /asset_proceds.json
  def create
    @asset_proced = AssetProced.new(asset_proced_params)

    respond_to do |format|
      if @asset_proced.save
        format.html { redirect_to @asset_proced, notice: 'Asset proced was successfully created.' }
        format.json { render :show, status: :created, location: @asset_proced }
      else
        format.html { render :new }
        format.json { render json: @asset_proced.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /asset_proceds/1
  # PATCH/PUT /asset_proceds/1.json
  def update
    respond_to do |format|
      if @asset_proced.update(asset_proced_params)
        format.html { redirect_to @asset_proced, notice: 'Asset proced was successfully updated.' }
        format.json { render :show, status: :ok, location: @asset_proced }
      else
        format.html { render :edit }
        format.json { render json: @asset_proced.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /asset_proceds/1
  # DELETE /asset_proceds/1.json
  def destroy
    @asset_proced.destroy
    respond_to do |format|
      format.html { redirect_to asset_proceds_url, notice: 'Asset proced was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_asset_proced
      @asset_proced = AssetProced.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def asset_proced_params
      params.require(:asset_proced).permit(:asset_id, :proced_id)
    end
end
