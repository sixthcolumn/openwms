class MaintordersController < ApplicationController
  before_action :set_maintorder, only: [:show, :edit, :update, :destroy]

  # GET /maintorders
  # GET /maintorders.json
  def index
    @maintorders = Maintorder.all
  end

  # GET /maintorders/1
  # GET /maintorders/1.json
  def show
  end

  # GET /maintorders/new
  def new
    @maintorder = Maintorder.new
  end

  # GET /maintorders/1/edit
  def edit
  end

  # POST /maintorders
  # POST /maintorders.json
  def create
    @maintorder = Maintorder.new(maintorder_params)

    respond_to do |format|
      if @maintorder.save
        format.html { redirect_to @maintorder, notice: 'Maintorder was successfully created.' }
        format.json { render :show, status: :created, location: @maintorder }
      else
        format.html { render :new }
        format.json { render json: @maintorder.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /maintorders/1
  # PATCH/PUT /maintorders/1.json
  def update
    respond_to do |format|
      if @maintorder.update(maintorder_params)
        format.html { redirect_to @maintorder, notice: 'Maintorder was successfully updated.' }
        format.json { render :show, status: :ok, location: @maintorder }
      else
        format.html { render :edit }
        format.json { render json: @maintorder.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /maintorders/1
  # DELETE /maintorders/1.json
  def destroy
    @maintorder.destroy
    respond_to do |format|
      format.html { redirect_to maintorders_url, notice: 'Maintorder was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_maintorder
      @maintorder = Maintorder.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def maintorder_params
      params.require(:maintorder).permit(:mRID, :status, :created_by, :maintorder_id, :name_type_id)
    end
end
