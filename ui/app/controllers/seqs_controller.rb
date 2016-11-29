class SeqsController < ApplicationController
  before_action :set_seq, only: [:show, :edit, :update, :destroy]

  # GET /seqs
  # GET /seqs.json
  def index
    @seqs = Seq.all
  end

  # GET /seqs/1
  # GET /seqs/1.json
  def show
  end

  # GET /seqs/new
  def new
    @seq = Seq.new
  end

  # GET /seqs/1/edit
  def edit
  end

  # POST /seqs
  # POST /seqs.json
  def create
    @seq = Seq.new(seq_params)

    respond_to do |format|
      if @seq.save
        format.html { redirect_to @seq, notice: 'Seq was successfully created.' }
        format.json { render :show, status: :created, location: @seq }
      else
        format.html { render :new }
        format.json { render json: @seq.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /seqs/1
  # PATCH/PUT /seqs/1.json
  def update
    respond_to do |format|
      if @seq.update(seq_params)
        format.html { redirect_to @seq, notice: 'Seq was successfully updated.' }
        format.json { render :show, status: :ok, location: @seq }
      else
        format.html { render :edit }
        format.json { render json: @seq.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /seqs/1
  # DELETE /seqs/1.json
  def destroy
    @seq.destroy
    respond_to do |format|
      format.html { redirect_to seqs_url, notice: 'Seq was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_seq
      @seq = Seq.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def seq_params
      params.require(:seq).permit(:seq_name, :start, :increment, :curval, :flag)
    end
end
