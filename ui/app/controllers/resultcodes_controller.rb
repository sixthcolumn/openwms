class ResultcodesController < ApplicationController
  before_action :set_resultcode, only: [:show, :edit, :update, :destroy]

  # GET /resultcodes
  # GET /resultcodes.json
  def index
    @resultcodes = Resultcode.all
  end

  # GET /resultcodes/1
  # GET /resultcodes/1.json
  def show
  end

  # GET /resultcodes/new
  def new
    @resultcode = Resultcode.new
  end

  # GET /resultcodes/1/edit
  def edit
  end

  # POST /resultcodes
  # POST /resultcodes.json
  def create
    @resultcode = Resultcode.new(resultcode_params)

    respond_to do |format|
      if @resultcode.save
        format.html { redirect_to @resultcode, notice: 'Resultcode was successfully created.' }
        format.json { render :show, status: :created, location: @resultcode }
      else
        format.html { render :new }
        format.json { render json: @resultcode.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /resultcodes/1
  # PATCH/PUT /resultcodes/1.json
  def update
    respond_to do |format|
      if @resultcode.update(resultcode_params)
        format.html { redirect_to @resultcode, notice: 'Resultcode was successfully updated.' }
        format.json { render :show, status: :ok, location: @resultcode }
      else
        format.html { render :edit }
        format.json { render json: @resultcode.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /resultcodes/1
  # DELETE /resultcodes/1.json
  def destroy
    @resultcode.destroy
    respond_to do |format|
      format.html { redirect_to resultcodes_url, notice: 'Resultcode was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_resultcode
      @resultcode = Resultcode.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def resultcode_params
      params.require(:resultcode).permit(:name)
    end
end
