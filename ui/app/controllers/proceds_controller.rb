class ProcedsController < ApplicationController
  before_action :set_proced, only: [:show, :edit, :update, :destroy]

  # GET /proceds
  # GET /proceds.json
  def index
    @proceds = Proced.all
  end

  # GET /proceds/1
  # GET /proceds/1.json
  def show
  end

  # GET /proceds/new
  def new
    @proced = Proced.new
  end

  # GET /proceds/1/edit
  def edit
  end

  # POST /proceds
  # POST /proceds.json
  def create
    @proced = Proced.new(proced_params)

    respond_to do |format|
      if @proced.save
        format.html { redirect_to @proced, notice: 'Proced was successfully created.' }
        format.json { render :show, status: :created, location: @proced }
      else
        format.html { render :new }
        format.json { render json: @proced.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /proceds/1
  # PATCH/PUT /proceds/1.json
  def update
    respond_to do |format|
      if @proced.update(proced_params)
        format.html { redirect_to @proced, notice: 'Proced was successfully updated.' }
        format.json { render :show, status: :ok, location: @proced }
      else
        format.html { render :edit }
        format.json { render json: @proced.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /proceds/1
  # DELETE /proceds/1.json
  def destroy
    @proced.destroy
    respond_to do |format|
      format.html { redirect_to proceds_url, notice: 'Proced was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_proced
      @proced = Proced.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def proced_params
      params.require(:proced).permit(:instruction, :kind, :sequence)
    end
end
