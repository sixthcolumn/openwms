class CrewNamesController < ApplicationController
  before_action :set_crew_name, only: [:show, :edit, :update, :destroy]

  # GET /crew_names
  # GET /crew_names.json
  def index
    @crew_names = CrewName.all
  end

  # GET /crew_names/1
  # GET /crew_names/1.json
  def show
  end

  # GET /crew_names/new
  def new
    @crew_name = CrewName.new
  end

  # GET /crew_names/1/edit
  def edit
  end

  # POST /crew_names
  # POST /crew_names.json
  def create
    @crew_name = CrewName.new(crew_name_params)

    respond_to do |format|
      if @crew_name.save
        format.html { redirect_to @crew_name, notice: 'Crew name was successfully created.' }
        format.json { render :show, status: :created, location: @crew_name }
      else
        format.html { render :new }
        format.json { render json: @crew_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /crew_names/1
  # PATCH/PUT /crew_names/1.json
  def update
    respond_to do |format|
      if @crew_name.update(crew_name_params)
        format.html { redirect_to @crew_name, notice: 'Crew name was successfully updated.' }
        format.json { render :show, status: :ok, location: @crew_name }
      else
        format.html { render :edit }
        format.json { render json: @crew_name.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /crew_names/1
  # DELETE /crew_names/1.json
  def destroy
    @crew_name.destroy
    respond_to do |format|
      format.html { redirect_to crew_names_url, notice: 'Crew name was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_crew_name
      @crew_name = CrewName.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def crew_name_params
      params.require(:crew_name).permit(:crew_id, :name, :name_type_id)
    end
end
