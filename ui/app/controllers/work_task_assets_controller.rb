class WorkTaskAssetsController < ApplicationController
  before_action :set_work_task_asset, only: [:show, :edit, :update, :destroy]

  # GET /work_task_assets
  # GET /work_task_assets.json
  def index
    @work_task_assets = WorkTaskAsset.all
  end

  # GET /work_task_assets/1
  # GET /work_task_assets/1.json
  def show
  end

  # GET /work_task_assets/new
  def new
    @work_task_asset = WorkTaskAsset.new
  end

  # GET /work_task_assets/1/edit
  def edit
  end

  # POST /work_task_assets
  # POST /work_task_assets.json
  def create
    @work_task_asset = WorkTaskAsset.new(work_task_asset_params)

    respond_to do |format|
      if @work_task_asset.save
        format.html { redirect_to @work_task_asset, notice: 'Work task asset was successfully created.' }
        format.json { render :show, status: :created, location: @work_task_asset }
      else
        format.html { render :new }
        format.json { render json: @work_task_asset.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /work_task_assets/1
  # PATCH/PUT /work_task_assets/1.json
  def update
    respond_to do |format|
      if @work_task_asset.update(work_task_asset_params)
        format.html { redirect_to @work_task_asset, notice: 'Work task asset was successfully updated.' }
        format.json { render :show, status: :ok, location: @work_task_asset }
      else
        format.html { render :edit }
        format.json { render json: @work_task_asset.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /work_task_assets/1
  # DELETE /work_task_assets/1.json
  def destroy
    @work_task_asset.destroy
    respond_to do |format|
      format.html { redirect_to work_task_assets_url, notice: 'Work task asset was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_work_task_asset
      @work_task_asset = WorkTaskAsset.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def work_task_asset_params
      params.require(:work_task_asset).permit(:work_task_id, :asset_id, :created_by)
    end
end
