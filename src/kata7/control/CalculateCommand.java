package kata7.control;

import kata7.model.Histogram;
import kata7.view.AttributeDialog;
import kata7.view.HistogramBuilder;
import kata7.view.HistogramDisplay;
import kata7.view.PopulationDialog;

public class CalculateCommand implements Command {

    private final AttributeDialog attributeDialog;
    private final PopulationDialog populationDialog;
    private final HistogramDisplay histogramDisplay;

    public CalculateCommand(AttributeDialog attributeDialog, PopulationDialog populationDialog, HistogramDisplay histogramDisplay) {
        this.attributeDialog = attributeDialog;
        this.populationDialog = populationDialog;
        this.histogramDisplay = histogramDisplay;
    }
    
    @Override
    public void execute() {
        Histogram histogram = new HistogramBuilder(populationDialog.population()).build(attributeDialog.attribute());
        histogramDisplay.show(histogram);
    }
}